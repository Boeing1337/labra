Диаграмма аглоритма суммы положительных чисел
Смотреть через https://mermaid.live/edit

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
