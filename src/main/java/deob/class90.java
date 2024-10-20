package deob;

@ObfuscatedName("dw")
public class class90 implements Runnable {

    @ObfuscatedName("dw.az")
    public boolean field1096 = true;

    @ObfuscatedName("dw.ah")
    public Object field1098 = new Object();

    @ObfuscatedName("dw.af")
    public int field1093 = 0;

    @ObfuscatedName("dw.at")
    public int[] field1094 = new int[500];

    @ObfuscatedName("dw.an")
    public int[] field1095 = new int[500];

    @ObfuscatedName("dw.ao")
    public long[] field1092 = new long[500];

    public void run() {
        while (this.field1096) {
            Object var1 = this.field1098;
            synchronized (this.field1098) {
                if (this.field1093 < 500) {
                    this.field1094[this.field1093] = class36.field217;
                    this.field1095[this.field1093] = class36.field218;
                    this.field1092[this.field1093] = class36.field219;
                    this.field1093++;
                }
            }
            class319.method7909(50L);
        }
    }
}
