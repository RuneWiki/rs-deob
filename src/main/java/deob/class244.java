package deob;

@ObfuscatedName("jg")
public class class244 extends class508 {

    @ObfuscatedName("jg.aq")
    public int field2626;

    @ObfuscatedName("jg.af")
    public int field2632;

    @ObfuscatedName("jg.at")
    public int[] field2627;

    @ObfuscatedName("jg.au")
    public int[][] field2629;

    @ObfuscatedName("jg.ar")
    public class242 field2630;

    public class244(int arg0, byte[] arg1) {
        this.field2626 = arg0;
        class551 var3 = new class551(arg1);
        this.field2632 = var3.method8955();
        this.field2627 = new int[this.field2632];
        this.field2629 = new int[this.field2632][];
        for (int var4 = 0; var4 < this.field2632; var4++) {
            this.field2627[var4] = var3.method8955();
        }
        for (int var5 = 0; var5 < this.field2632; var5++) {
            this.field2629[var5] = new int[var3.method8955()];
        }
        for (int var6 = 0; var6 < this.field2632; var6++) {
            for (int var7 = 0; var7 < this.field2629[var6].length; var7++) {
                this.field2629[var6][var7] = var3.method8955();
            }
        }
        if (var3.field5415 < var3.field5413.length) {
            int var8 = var3.method9119();
            if (var8 > 0) {
                this.field2630 = new class242(var3, var8);
            }
        }
    }

    @ObfuscatedName("jg.ac(I)I")
    public int method4493() {
        return this.field2632;
    }

    @ObfuscatedName("jg.ae(I)Ljp;")
    public class242 method4491() {
        return this.field2630;
    }
}
