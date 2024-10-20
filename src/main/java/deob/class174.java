package deob;

@ObfuscatedName("aj")
public class class174 extends class77 {

    @ObfuscatedName("aj.f")
    public String[] field2626;

    @ObfuscatedName("aj.g")
    public int[] field2629;

    @ObfuscatedName("aj.e")
    public int[] field2627;

    @ObfuscatedName("aj.n")
    public int field2620 = 0;

    @ObfuscatedName("aj.o")
    public int field2621;

    @ObfuscatedName("aj.h")
    public String field2623 = "null";

    @ObfuscatedName("aj.t")
    public char field2622;

    @ObfuscatedName("aj.r")
    public int field2624;

    @ObfuscatedName("aj.p")
    public static class67 field2625 = new class67(64);

    @ObfuscatedName("aj.p(Ldy;II)V")
    public void method3351(class31 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2621 = arg0.method512();
        } else if (arg1 == 2) {
            this.field2622 = (char) arg0.method512();
        } else if (arg1 == 3) {
            this.field2623 = arg0.method379();
        } else if (arg1 == 4) {
            this.field2624 = arg0.method376();
        } else if (arg1 == 5) {
            this.field2620 = arg0.method373();
            this.field2629 = new int[this.field2620];
            this.field2626 = new String[this.field2620];
            for (int var3 = 0; var3 < this.field2620; var3++) {
                this.field2629[var3] = arg0.method376();
                this.field2626[var3] = arg0.method379();
            }
        } else if (arg1 == 6) {
            this.field2620 = arg0.method373();
            this.field2629 = new int[this.field2620];
            this.field2627 = new int[this.field2620];
            for (int var4 = 0; var4 < this.field2620; var4++) {
                this.field2629[var4] = arg0.method376();
                this.field2627[var4] = arg0.method376();
            }
        }
    }

    @ObfuscatedName("aj.j(Ldy;I)V")
    public void method3355(class31 arg0) {
        while (true) {
            int var2 = arg0.method512();
            if (var2 == 0) {
                return;
            }
            this.method3351(arg0, var2);
        }
    }
}
