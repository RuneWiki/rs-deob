package deob;

@ObfuscatedName("p")
public class class94 implements Runnable {

    @ObfuscatedName("p.b")
    public int field1324 = 0;

    @ObfuscatedName("p.c")
    public Object field1325 = new Object();

    @ObfuscatedName("p.m")
    public int[] field1323 = new int[500];

    @ObfuscatedName("p.i")
    public int[] field1326 = new int[500];

    @ObfuscatedName("p.v")
    public boolean field1327 = true;

    public void run() {
        while (this.field1327) {
            Object var1 = this.field1325;
            synchronized (this.field1325) {
                if (this.field1324 < 500) {
                    this.field1326[this.field1324] = class116.field1810;
                    this.field1323[this.field1324] = class116.field1816;
                    this.field1324++;
                }
            }
            class134.method1468(50L);
        }
    }
}
