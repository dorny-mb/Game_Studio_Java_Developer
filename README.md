# Game_Studio_Java_Developer

## Part 1

Create a Github account on github [https://github.com/](https://github.com/ 'Github') or use your existing account if you
already have one.
Create a public repository for this project.
Create an initial commit with the expertise test outline (this document) in the readme.md
Create frequent commits of your code. (at least 1 commit every 15 min)
Create a service capable of serving the following endpoints:
For all of the below endpoints a log entry needs to be created for their execution duration.

- #### /conversions/ktoc
  The ktoc endpoint should produce an output amount in celsius when given an input amount
  in kelvin.
- #### /conversions/ctok
  The ctok endpoint should produce an output amount in kelvin when given an input amount in
  celsius.
- #### /conversions/mtok
  The mtok endpoint should produce, when given an input amount in miles, an output amount
  in kilometers.
- #### /conversions/ktom
  The ktom endpoint should produce, when given an input amount in kilometers, an output
  amount in miles.

## Part 2 – Console Roulette

Console Roulette
Roulette is a popular casino game. The aim of the exercise is to create a simple command line multiplayer version of the game.
On start-up, load a file which contains a list of player's names:

### Input file 1

```bash
Tiki_Monkey
Barbara

```

Once started, it should read lines from the console, each line will contain the player's name, what they want to bet on (either a number from
1-36, EVEN or ODD), and how much they want to bet:

### Console input 1

```bash
Tiki_Monkey 2 1.0
```

Or

### Console input 2

```bash
Barbara EVEN 3.0
```

The application should support multiple bets from the same user within a round.
Every 30 seconds the game should choose a random number between 0 and 36 (inclusive) for the ball to land on.
If the number is 1-36 then any bet on that number wins, and the player wins 36x the bet's amount.
If the number is even, any bet on EVEN wins, and the player wins 2x the bet's amount.
If the number is odd, any bet on ODD wins, and the player wins 2x the bet's amount.
All other bets lose.
It must be possible to place bets and choose a random number concurrently.
The game should print to the console the number and for each bet - the player's name, the bet, whether they won or lost, and how much they
won:

### Output 1

```bash
Number: 4
Player Bet Outcome Winnings

---

Tiki_Monkey 2 LOSE 0.0
Barbara EVEN WIN 6.0
```

Bets are cleared after each betting round.
Optional Bonus Question
We'd like to print out the total amount a player has won and bet. The input file (with players' names) should have optional "total win" and
"total bet" comma separated values which are the amounts player has won and bet in the past. No value should be treated as zero.

### Input File 2

```bash
Tiki_Monkey,1.0,2.0
Barbara,2.0,1.0
```

After each number is chosen print out the totals in a tabular format (after the previous output is printed):

### Output 2

```bash
Player Total Win Total Bet

---

Tiki_Monkey 1.0 3.0
Barbara 8.0 4.0
```

Tiki_Monkey brought in total win 1.0 and total bet 2.0. He bet 1.0 on number 2 and lost so his total bet has increased to 3.0.
Barbara brought in total win 2.0 and total bet 1.0. She bet 3.0 on EVEN and won 6.0. Hence her total win is now 2.0 + 6.0 = 8.0 and her total
bet is 1.0 + 3.0 = 4.0.
