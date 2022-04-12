# WAR
A beautiful and nice program that simulates the war game. This is in coop with @Pietro1893



______________________________________________________________________________________________________________________________________________________________________
|        ALPHA         |
|----------------------|

In questo caso abbiamo deciso di creare un alpha per simulare il gioco senza la creazione di un mazzo completo. Infatti esso funzionerà senza un limite del mazzo ma bensì fino a che uno dei due giocatori non raggiungerà un punteggio prefissato (26 in questo caso). In caso di guerra non si impileranno le carte ma bensì si avrà un "pop-up" che ci dirà "WAR" e quindi non aggiungerà punti a nessuno dei due. In caso di raggiungimento di 26 di uno dei due giocatori usciranno una scritta diversa l'una dall'altra: in un caso "Left player has won" e nell'altro "Right player has won". Dopo un wait di 4 secondi poi il gioco farà tornare entrambi i giocatori a 0 e si ricomincerà. 
______________________________________________________________________________________________________________________________________________________________________


______________________________________________________________________________________________________________________________________________________________________
|    PARTE GRAFICA     |
|----------------------|

Per la perte grafica abbiamo lavorato con l'editor "android studio" che ci ha permesso di lavorare con un'anteprima del programma e di poter inserire oggetti al suo interno. Infatti oltre che inserire al suo interno gli oggetti potevamo dall'anteprima inserire proprietà per essi. 
All'interno della nostra anteprima abbiamo inserito 2 <imageView> che sono le due "celle" che contengono le immagini della carta coperta inizialmente e che poi contengono la carta da gioco in sé, un button "deal" che attiva la funzione onclick() e scopre le due carte coperte nell'imageView e poi per finire due <textview> che contengono il punteggio dei due giocatori. Inoltre abbiamo potuto lavorare all'app come un sito online e quindi abbiamo potuto inserire il background-color e le immagini delle carte e sistemarle tramite l'anteprima. 
______________________________________________________________________________________________________________________________________________________________________


______________________________________________________________________________________________________________________________________________________________________
|SPIEGAZIONE DEI METODI|
|----------------------|


OnCreate(): crea lo score di entrambi i player e lo setta al numero del counter card_left o card_right che inizialmente è settato a 0. 

Onclick(): viene chiamato ogni volta che viene schiacciato il button che permette di giocare. Infatti la funzione setta prima il punteggio corrente in view e poi crea le due carte randomiche da entrambi i lati. Dopodiché viene aumentato uno dei due counter a seconda di chi ha vinto il round. Se le due carte hanno un'id pari e quindi sono state generate da entrambi i lati 2 carte uguali appare una scritta in sovraimpressione che dichiara la "war" e non da il punto a nessuno (perché nella guerra nessuno ne esce vincitore </3). Infine ogni volta che viene chiamata la funzione (e quindi viene schiacciato il button) controllo che gli score siano arrivati a 26. Nel caso uno dei due fosse arrivato a quel numero esce in sovraimpressione la scritta "left_player has won the war" oppure "right_player has won the war" a seconda di chi è arrivato al punteggio prestabilito. Poi dopo aver stampato il messaggio richiama la funzione oncreate() che riporta tutto allo stato originale.  
_______________________________________________________________________________________________________________________________________________________________________


  
______________________________________________________________________________________________________________________________________________________________________
|         BETA         |
|----------------------|  

Abbiamo deciso di iniziare a programmare la Beta del programma. Ciò porterà ai seguenti update:
  
-Mazzo di carte 
  
                Viene aggiunto un nuovo mazzo che sarà limitato
  
                Punteggio che non va fino a che uno dei due arrivi a 26 ma bensì fino a che il mazzo non arrivi alla fine. 
  
-Tutti i tipi di carte:
  
                 All'interno del mazzo saranno inserite tutte e 52 le carte da gioco classiche. 

-Nuove grafiche:
  
                 Nuovi dorsi per le carte adattati alla dimensione del background. 
  
                 Nuova icona del gioco sul desktop. 
  
-Bug fixing: 
  
             Risolto il bug per cui la partita veniva resettata automaticamente alla fine senza avere una wait. 
             
             Risolto il bug che permetteva di schiacciare a ripetizione il tasto "deal" e che mandava in tilt il sistema.  
______________________________________________________________________________________________________________________________________________________________________
