/**
 * 实例方法(non-static)是只能由一个类的特定实例才能执行的操作。
 *  需要创建一个新的类才能调用 
 * 
 * Math m = new Math();
 * x = m.sqrt(100);
 * 
 * 静态方法(static)是由类本身承担的操作。 直接可以调用
 * 
 * x = Math.sqrt(100);
 * 
 */



/**
 * this表示当前类
 * 
 * public Dog maxDog(Dog d2) {
 * if (this.weightInPounds > d2.weightInPounds)
 *      return this;
 *    }
 *  return d2;
 * }
 * 
 * 等价于
 * Dog d = new Dog(15);
 * Dog d2 = new Dog(100);
 * d.maxDog(d2);
 */


 /**
 * 静态函数内只能有静态变量
 * 存储类名	        生命周期	         作用域
 * extern	静态（程序结束后释放）	外部（整个程序）
 * static	静态（程序结束后释放）	内部（仅翻译单元，一般指单个源文件）
 * auto,register	函数调用（调用结束后释放）	无
 */