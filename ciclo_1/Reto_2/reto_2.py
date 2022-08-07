# reto 2 Multa

'''distancia = float(input()) #distancia entre camaras en mts
velocidad = float(input()) #velocidad maxima tramo en km/h
tiempo = float(input())  #tiempo en segundos entre las 2 camaras'''

distancia, velocidad, tiempo = input().split()

distancia = int(distancia)
velocidad = float(velocidad)
tiempo = float(tiempo)
#print(distancia, velocidad, tiempo)

velUsuario = (distancia / tiempo)

veloLimetroseg = (velocidad / 3.6)

velCurso = (veloLimetroseg * 1.2)

def controlVelocidad():
  if veloLimetroseg <= 0 or velUsuario <= 0:
    print("ERROR")
  elif (velUsuario <= veloLimetroseg):
    print("OK")
  elif (veloLimetroseg < velUsuario <= velCurso): 
    print("MULTA")
  else: #
    print("CURSO DE SENSIBILIZACION")

controlVelocidad()    

# chequeado en python tutor

distancia = float(input()) #distancia entre camaras
velocidad = float(input()) #velocidad maxima tramo en km/h
tiempo = float(input())  #tiempo en segundos entre las 2 camaras

'''distancia = int(distancia)
velocidad = float(velocidad)
tiempo = float(tiempo)
print(distancia, velocidad, tiempo)'''

type(distancia)
type(velocidad) 
type(tiempo)

velUsuario = (distancia / tiempo)
#print(velUsuario)

veloLimetroseg = (velocidad / 3.6)
#print(veloLimetroseg)

velCurso = (veloLimetroseg * 1.2)
#print(velCurso)

def controlVelocidad():
  if veloLimetroseg <= 0 or velUsuario <= 0:
    print("ERROR")
  elif (velUsuario <= veloLimetroseg):
    print("OK")
  elif (veloLimetroseg < velUsuario <= velCurso): 
    print("MULTA")
  #elif (velUsuario > velCurso):
  else:
    print("CURSO DE SENSIBILIZACION")
    
    
controlVelocidad()
