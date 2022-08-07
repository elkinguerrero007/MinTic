#Voy primero a preguntar el numero de bicicletas a validar y con esa informacion voy a crear una lista de bicicletas.

n = int(input())
bicicletas = []

for i in range(n):
  bicicletas.append(input().split())
  
#print(bicicletas)

# for i in bicicletas:
#   bicis = []
#   n = int(i)
#   bicis.append(n)


bicisint = [list(map(int, x)) for x in bicicletas]  #para convertir todos los elementos de la lista a int
#print(bicisint)

def validar_disponibilidad(entrada):
    if not entrada:
      print ('NO DISPONIBLE')

def validar_uci(bicisint):
  contador = 0
  disponible = True
  conteo = 0
  for bici in bicisint:
    #if contador == len(bicisint):
      #print('NO DISPONIBLE')
    #for parte in bici:
    pedalier, bielas, sillin, manilar, precio = bici
    if (pedalier > 239 and pedalier < 301) and (bielas > 159 and bielas < 181) and (sillin > 239 and sillin < 276) and (manilar < 51):
      print(precio)
      conteo += 1
      
    elif conteo == 0:
        disponible = False
        
        return validar_disponibilidad(disponible)
    contador += 1 
    

   
        
validar_uci(bicisint)
