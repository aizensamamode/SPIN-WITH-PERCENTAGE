# explanation

RARE   = 15
COMMON = 50
EPIC   = 5
Total space:
Copy code
15 + 50 + 5 = 70
Now imagine this single line:

lua
Copy code
0 ---------------------------------------------------- 69
Now items CLAIM space on that line:

yaml
Copy code
RARE   : 0  – 14   (15 slots)
COMMON : 15 – 64   (50 slots)
EPIC   : 65 – 69   (5 slots)
👉 COMMON does NOT mean 0–50
👉 COMMON means “50 slots AFTER whatever came before”

That’s why it ends at 65, not 50.

Why this is NOT wrong mathematically
Let’s calculate REAL percentages:

Item	Slots	Real %
RARE	15	21.4%
COMMON	50	71.4%
EPIC	5	7.1%

So COMMON is still ~71% chance — it’s not broken.

Why games do it this way (important)
1️⃣ Absolute percentages break easily
If you add a new item:

You must recalculate EVERYTHING

Mistakes happen

2️⃣ Relative weights are flexible
You can add:

java
Copy code
new Item("ULTRA", 1);
No recalculation needed.
The system auto-adjusts.

REAL game examples (not theory)
🎮 Gacha games
Each character has a weight

System rolls once in total weight

NOT checking percentages one by one

🎮 RPG loot drops
Enemies drop items based on weighted tables

Exactly this logic

🎮 MMORPG bosses
Rare loot uses very small weights (1–5)

Common loot uses large weights (50–100)

Why your brain says “this feels wrong”
Because humans think:

“Percentages must add to 100”

But computers think:

“Chance is just relative frequency”

Both are valid — but games use the second.

One final analogy (this usually clicks)
Imagine a raffle box 🎟️
COMMON has 50 tickets

RARE has 15 tickets

EPIC has 5 tickets

When you draw ONE ticket:

COMMON wins more often

EPIC almost never wins

Nobody asks:

“Why does COMMON go past 50?”

Because tickets are not percentages, they’re counts.

🧠 The sentence you must lock in
Games don’t roll percentages — they roll ranges created by weights.