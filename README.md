# WAR
A beautiful and nice program that simulates the war game. This is in coop with @Pietro1893
L'idea è molto semplice: Ogni giocatore ha 26 carte casuali. Abbiamo un'immagine per ogni carta (quindi solo un seme ex: ho solo un asso che è quello di fiori. 
Non utilizzo cuori, picche e denari) perché in questo gioco i semi non contano. Per esempio un 5 di cuori ha lo stesso valore di un 5 di fiori. La carta con il valore 
più alto vince. All'inizio del gioco abbiamo le carte coperte e un button che attiva la funzione scopri(). Così facendo estrae una carta a caso tra le 26 nel mazzo e 
confronta il valore delle 2. Chi vince prende la carta dell'altro e crea un secondo mazzo coperto (che avrà una coda LIFO). In caso di pareggio si potrà decidere di fare "guerra" 
tramite un button. La carta di ognuno viene coperta da altre 2 in orizzontale coperte e poi ne viene impilata un'ultima verticalmente già scoperta che determinerà l'andamento
della battaglia. Chi vince prende tutte le carte in campo per un totale di almeno 8 (potrebbero aumentare in caso di ulteriore guerra e quindi si hanno altri impilamenti). 
Nello sfortunato caso finiscano entrambi le carte durante la guerra, il mazzo viene sostituito da quello coperto che segna la vincita. Nel caso nessuno dei due abbia carte
sufficienti anche con i mazzi vincita perché la guerra continui, si ha una ritirata e tutte le carte tornano al legittimo proprietario. Nel caso uno dei due giocatori non possa
completare la guerra ha perso e la vittoria va all'altro. Se una persona, finito il proprio mazzo attuale, non ha carte nel mazzo vincita perde la partita. 

|        ALPHA         |
|----------------------|

In questo caso abbiamo deciso di creare un alpha per simulare il gioco senza la creazione di un mazzo completo. Infatti esso funzionerà senza un limite del mazzo ma bensì fino a che uno dei due giocatori non raggiungerà un punteggio prefissato (26 in questo caso). In caso di guerra non si impileranno le carte ma bensì si avrà un "pop-up" che ci dirà "WAR" e quindi non aggiungerà punti a nessuno dei due. In caso di raggiungimento di 26 di uno dei due giocatori usciranno una scritta diversa l'una dall'altra: in un caso "Left player has won" e nell'altro "Right player has won". Dopo un wait di 4 secondi poi il gioco farà tornare entrambi i giocatori a 0 e si ricomincerà. 


|    PARTE GRAFICA     |
|----------------------|

/*
*insert spiegation here
*/


|SPIEGAZIONE DEI METODI|
|----------------------|

OnCreate(): crea lo score di entrambi i player e lo setta al numero del counter card_left o card_right che inizialmente è settato a 0. 

Onclick(): viene chiamato ogni volta che viene schiacciato il button che permette di giocare. Infatti la funzione setta prima il punteggio corrente in view e poi crea le due carte randomiche da entrambi i lati. Dopodiché viene aumentato uno dei due counter a seconda di chi ha vinto il round. Se le due carte hanno un'id pari e quindi sono state generate da entrambi i lati 2 carte uguali appare una scritta in sovraimpressione che dichiara la "war" e non da il punto a nessuno (perché nella guerra nessuno ne esce vincitore </3). Infine ogni volta che viene chiamata la funzione (e quindi viene schiacciato il button) controllo che gli score siano arrivati a 26. Nel caso uno dei due fosse arrivato a quel numero esce in sovraimpressione la scritta "left_player has won the war" oppure "right_player has won the war" a seconda di chi è arrivato al punteggio prestabilito. Poi dopo aver stampato il messaggio richiama la funzione oncreate() che riporta tutto allo stato originale.  

