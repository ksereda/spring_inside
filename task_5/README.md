task 5: My Scope

______________________________________

Пишем свой scope для бина и делаем Screensaver

______________________________________

* Part 1

 
    - package: screensaver
    
    Делаем screensaver, который будет мигать по экрану в произвольном порядке и каждый раз менять цвет на новый

1. Делаем класс, в котором опишем метод, который будет менять локацию

2. Настроим не через XML, а через java-config

3. Frame должен быть 1 (т.е. `singleton`), т.е. каждый раз мы должны получать один и тот же объект, а цвет должен быть всегда другой (т.е. `prototype`)

4. Разбираем 3 возможных варианта решения, где первые 2 неверные, но рабочие

______________________________________

* Part 2


    - package: screensaver2
    
    Дополняем наш screensaver: хотим сделать так, чтобы цвет менялся каждые 3 секунды, а не каждый раз, когда окно мигает и появляется в новом месте
    
1. Придумаем свой `scope - "periodical"`. 
   
   - Для этого надо имплементировать `интерфейс Scope`
    
2. Опишем свою реализацию `метода get` у `интерфейса Scope`

3. Надо зарегистрировать класс `PeriodicalScopeConfigurer`, в котором мы описывали основную логику `метода get`.
   
   - Надо указать контексту, что мы зарегистрируем в него новый вид scope, за который отвечает такой-то объект.
 
   - В какой момент мы должны это сделать ? `До создания контекста - BeanFactoryPostProcessor`
   
4. Создаем свой `CustomScopeRegistryBeanFactoryPostProcessor`, который будет регистрировать любой кастомный написанный scope.

5. Надо прописать его как bean

   
   
    



