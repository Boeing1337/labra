#### Смотреть через https://mermaid.live/edit

## Диаграмма аглоритма суммы положительных чисел

```
---
config:
  layout: dagre
---
flowchart TD
A["Начало"] --> B["Ввод массива A размерности N"]
B --> C["sum = 0, count = 0"]
C --> D["i = 0"]
D --> E{"i &lt; N"}
E -- no --> n1["print count, sum"]
E -- yes --> n2["A[i] &gt; 0"]
n2 -- yes --> n3["sum = sum + A[i]"]
n3 --> J["count = count + 1"]
J --> n4["i = i + 1"]
n2 -- no --> n4
n4 --> E
n2@{ shape: diam}
n4@{ shape: rect}
```

## Диаграмма аглоритма произведения чисел выше порога

```
---
config:
layout: dagre
---
flowchart TD
A["Начало"] --> B["Ввод массива A размерности N и порога B"]
B --> C["count = 0, product = 1, hasExceeding = false"]
C --> D["i = 0"]
D --> E{"i &lt; N?"}
E -- no --> F{"hasExceeding?"}
F -- yes --> G["product = product"]
F -- no --> H["product = 0"]
G --> I["Вывод count, product"]
H --> I
I --> J["Конец"]
E -- yes --> K["A[i] &gt; B?"]
K -- yes --> L["count = count + 1"]
L --> M["product = product * Ai"]
M --> N["hasExceeding = true"]
N --> O["i = i + 1"]
K -- no --> O
O --> E
```
