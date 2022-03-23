# Blackjack
A beautiful and nice program that simulates the blackjack game. This is in coop with @Pietro1893
OK. L'idea del programma non è più quella di simulare il gioco di blackjack ma bensì di utilizzare le regole del gioco "Guerra"
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

In questo caso abbiamo deciso di creare un alpha per simulare il gioco senza la creazione di un mazzo completo. Il gioco invece 


|SPIEGAZIONE DEI METODI|
|----------------------|

