export class SingletonExample {
    private static instance: SingletonExample;
  
    private constructor() {}
  
    public static getInstance(): SingletonExample {
      if (!SingletonExample.instance) {
        SingletonExample.instance = new SingletonExample();
      }
      return SingletonExample.instance;
    }
  
    // Otros métodos y propiedades si es necesario
  }
  