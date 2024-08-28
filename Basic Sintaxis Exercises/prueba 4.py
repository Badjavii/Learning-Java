import numpy
import numpy as np
import random
from colorama import *
init(autoreset=True)

def main():
    
    ### DECLARACIONES DE ARREGLOS ###
    
    P = np.array(["        "]*12)       # Arreglo de Placas
     
    D = np.array(["         "]*13)      # Arreglo de Distancias 
    
    PC = np.array(["       "]*13)       # Arreglo de Placas Correctas
    
    MC = np.array(["         "]*13)     # Arreglo de Monto de Combustible
    
    MCO = np.array(["         "]*13)    # Arreglo de Monto de Combustible Ordenado
    
    ### FUNCIONES ###
    
    # Funcion para determinar si el caracter es numero\
    def es_num(char):
        if (char != "1") and (char != "2") and (char != "3") and (char != "4") and (char != "5") and (char != "6") and (char != "7") and (char != "8") and (char != "9") and (char != "0"):
            return False
        return True
        
    # Funcion para leer el archivo 'transporte.txt'
    def Leer(P, D):
        arch = open("C:/Users/javie/Downloads/transporte.txt", "rt")
        r = 0
        i = 0
        for linea in arch.readlines():
            linea = linea.strip()
            if r % 2 == 0:  
                P[i] = linea
            else:  
                D[i] = linea
                i += 1
            r += 1
        arch.close()
        return P, D

    # Funcion para Corregir las Placas  
    def PlacasCorrectas(P):
        PC = np.array(["       "]*len(P))
        for i in range(0,len(P),1):
            pcorrec = ""
            for j in range(0, len(P[i]), 1):
                if (es_num(P[i][j]) == False):
                    pcorrec = pcorrec + P[i][j]
            if (len(pcorrec) > 0):
                PC[i] = pcorrec
        return PC
    
    ##### PROGRAMA PRINCIPAL #####
    
    # Llamada de la Fucnion 
    P,D = Leer(P,D) 
    print(Fore.BLUE+"***** El archivo de transporte ha sido leido correctamente *****")
    print()
    
    print(Fore.BLUE+"A continuación se mostraran las Placas de cada camion con sus respectivas Distancias: \n\n")
    print(Fore.BLUE+" Nro CAMION     |     PLACAS     |     DISTANCIAS")
    print(Fore.BLUE+"--------------------------------------------------")
    for i in range(0,len(P),1):
        print(" Camion ", i+1, "     |  ", P[i], "       |    ", D[i])
    print()

    PC = PlacasCorrectas(P)
    print(Fore.BLUE+"A continuación se mostraran las Placas de cada camion de forma correcta (sin numeros): \n\n")
    print(Fore.BLUE+" Nro CAMION     |     PLACAS        |  PLACAS CORRECTAS")
    print(Fore.BLUE+"--------------------------------------------------------")
    for i in range(0,len(P),1):
        print(" Camion ", i+1, "     |  ", P[i], "       |    ", PC[i])
    print()
    
    
main()