# Padrões de Projeto
## Singleton

Nesse exemplo da aplicação do padrão de projeto Singleton, existe uma fábrica com o intuito de "construir" diversas figuras geométricas. Entretanto, somente a construção de 1 círculo é permitida, e somente três instâncias de Triângulos (sendo um triângulo isósceles, um escaleno e outro retângulo); enquanto seja permitido a construção de inúmeros quadrados. Para isso é aplicado o padrão Singleton, que controla a instanciação dessas classes pela classe cliente "Fábrica de Figuras".
