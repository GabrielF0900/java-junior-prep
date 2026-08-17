# Exercício 01 — Two Sum

## 0. Enunciado

Voce recebe um array de numeros inteiros chamado de num e um numero inteiro chamado target.

Encontre dois elementos localizados em posições diferentes do array cuja soma seja igual ao valor de target.

Ao encontrar esses elementos, retorne os indices das duas posições. Nao retorne os valores dos elementos.

---

## 1. Entender

### O que recebo como entrada?

nums = [2,7,11,15]
target = 9

### O que preciso retornar?

os indices [0,1]

### Qual relação precisa existir entre os elementos?

Eles somados devem dar o valor de target = 9.

### Quais regras e restrições foram apresentadas?

- O array pode conter numeros positivos e negativos
- Os indices devem ser diferentes
- Sempre haverá uma solução

### Exemplo construído manualmente

Entrada: nums = [2,7,11,15], target = 9

Saída: [0,1]

### Como explico o problema com minhas palavras?

Vou receber uma lista de numeros inteiros e um target. Preciso encontrar quais dos indices da lista somados resultam no target.

---

## 2. Reunir os elementos

### Informações que o problema fornece

- É um array.
- Eu preciso percorrer a array.
- Preciso pegar 2 indices diferentes.
- A soma dos valores nessas posições deve ser igual ao target.

### Informações que preciso descobrir

Quais operações matemáticas eu preciso realizar. Quais dados eu preciso para realizar essas operações. Quais são os limites e regras.

### Operações que precisarei realizar

Soma

### Casos que podem causar erro

- Indices iguais
- Elementos repetidos
- Elementos negativos
- Target negativo

---

## 3. Planejar

### Solução mais simples que consigo imaginar

Eu vou percorrer o array de numeros inteiros.

### Como executar essa solução manualmente?

nums = [2,7,11,15], target = 9

primeiro numero = 2
 segundo numero = 7
soma = 9

retorno indices [0,1]

### Essa solução verifica casos desnecessários?

Sim, essa solução verifica casos desnecessários.

### Qual parte pode ficar lenta?

Eu vou percorrer o array de numeros inteiros.

### Que tipo de operação preciso acelerar?

estrutura for.

## 4. Escolher a estrutura de dados

### Estruturas consideradas

- Array
- Hashmap

### Operações necessárias

- Adicionar elementos
- Buscar elementos

### Estrutura escolhida

Hashmap

### Por que essa estrutura atende ao problema?

Porque com essa estrutrura eu tenho poder de adicionar elementos e buscar elementos em O(1)

### Quais informações ela armazenará?

- valor e posição do elemento

---

## 5. Pseudocódigo

Escrever a solução em português, sem sintaxe Java.

```
função twoSum(nums, target):
	mapa = novo HashMap()

	para i de 0 até tamanho(nums) - 1:
		numero = nums[i]
		complemento = target - numero

		se mapa contém complemento:
			retorne [mapa.get(complemento), i]

		mapa.put(numero, i)

	retorne [] // Nunca deve acontecer, segundo enunciado
```

---

## 6. Desenvolver

### Assinatura do método

public int[] twoSum(int[] nums, int target)

### Implementação Java

A preencher somente depois do pseudocódigo.

---

## 7. Testar

| Cenário | Entrada | Saída esperada | Resultado |
|---|---|---|---|
| Caso comum | A preencher | A preencher | Pendente |
| Valores repetidos | A preencher | A preencher | Pendente |
| Números negativos | A preencher | A preencher | Pendente |
| Resposta no final | A preencher | A preencher | Pendente |

---

## 8. Analisar

### Complexidade de tempo

A preencher.

### Complexidade de espaço

A preencher.

### Por que cheguei a essas complexidades?

A preencher.

---

## 9. Explicar

### Explicação Feynman

Explicar:

1. o que o problema solicita;
2. qual foi o primeiro plano;
3. qual era o problema desse plano;
4. qual estrutura foi escolhida;
5. como a solução funciona;
6. como foi testada;
7. quais são as complexidades.

A preencher.

---

## 10. Retrospectiva

### Onde tive dificuldade?

A preencher.

### O que aprendi?

A preencher.

### Que parte consigo reconstruir sem consultar?

A preencher.

### O que preciso revisar?

A preencher.