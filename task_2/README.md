task 3: three_phase_constructor

- ContextListener

Мы хотим, чтобы все методы, которые аннотированы `@PostProxy` запускались сами в тот момент, когда уже все настроено и все `proxy` уже сгенерировались.
Это сможет сделать только `ContextListener`, т.к. в нем есть метод, который действует позже, чем `PostConstruct`. (т.е. `PostConstruct` работает до того, как настроились все прокси.)
    
    - вначале `postProcessBeforeInitialization`
	- потом `PostConstruct` (метод init())
	- потом `postProcessAfterInitialization`

Мы вытаскиваем bean только в том случае, если в его классе существует метод над которым стоит `@PostProxy` (это значит что его сейчас надо запускать).
