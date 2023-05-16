# Spring Boot Tranning

O treinamento tem por intuito melhorar habilidades com padrões de projeto e utilização da ferramente spring boot. O primeiro padrão usado foi VO

## Padrão Value Object:

O padrão Value Object (VO), também conhecido como Objeto de Valor, é um padrão de projeto de software que representa um objeto imutável que encapsula um conjunto de valores relacionados. Ao contrário das entidades, que são identificadas por um ID único e podem ter alterações em seus atributos ao longo do tempo, os objetos de valor são definidos por seu conteúdo e não possuem identidade própria.

Os objetos de valor são usados para modelar conceitos do domínio que são tratados como um todo indivisível e não precisam ser rastreados individualmente. Eles são frequentemente usados para representar informações como datas, horas, endereços, coordenadas geográficas, entre outros.

Uma característica importante dos objetos de valor é que eles são imutáveis, o que significa que seus atributos não podem ser alterados depois de criados. Isso garante a consistência e a integridade dos dados, evitando efeitos colaterais indesejados.

O uso de objetos de valor traz benefícios como simplicidade, reusabilidade e segurança, uma vez que os objetos imutáveis são mais fáceis de serem compreendidos, testados e compartilhados entre diferentes partes do sistema.

No contexto do desenvolvimento de software, o padrão Value Object é amplamente utilizado em conjunto com outros padrões, como o Domain-Driven Design (DDD), para modelar de forma mais precisa e expressiva o domínio de uma aplicação.
