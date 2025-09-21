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
    E -- нет --> n1["count, sum"]
    E -- да --> n2["A[i] &gt; 0"]
    n2 -- да --> n3["sum = sum + A[i]"]
    n3 --> J["count = count + 1"]
    J --> n4["i = i + 1"]
    n2 -- нет --> n4
    n4 --> E
    n1 --> n5["Конец"]
    A@{ shape: rounded}
    n1@{ shape: lean-r}
    n2@{ shape: diam}
    n4@{ shape: rect}
    n5@{ shape: rounded}
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
    E -- нет --> F{"hasExceeding"}
    F -- да --> G["product = product"]
    F -- нет --> H["product = 0"]
    G --> I["Вывод count, product"]
    H --> I
    I --> J["Конец"]
    E -- да --> K["A[i] &gt; B?"]
    K -- да --> L["count = count + 1"]
    L --> M["product = product * A[i]"]
    M --> N["hasExceeding = true"]
    N --> O["i = i + 1"]
    K -- нет --> O
    O --> E
    A@{ shape: rounded}
    I@{ shape: lean-r}
    J@{ shape: rounded}

```
