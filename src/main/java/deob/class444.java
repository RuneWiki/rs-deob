package deob;

@ObfuscatedName("rl")
public class class444 extends class450 {

    @ObfuscatedName("rl.al")
    public final class508 field4687;

    @ObfuscatedName("rl.ak")
    public final class442 field4682;

    @ObfuscatedName("rl.ax")
    public String field4683 = null;

    @ObfuscatedName("rl.ao")
    public String field4684 = null;

    @ObfuscatedName("rl.ah")
    public byte field4680;

    @ObfuscatedName("rl.ar")
    public int field4681;

    @ObfuscatedName("rl.ab")
    public int field4686 = 1;

    public class444(class508 arg0, class442 arg1) {
        super(500);
        this.field4687 = arg0;
        this.field4682 = arg1;
    }

    @ObfuscatedName("rl.ac(I)Lrp;")
    public class448 method7257() {
        return new class447();
    }

    @ObfuscatedName("rl.al(II)[Lrp;")
    public class448[] method7263(int arg0) {
        return new class447[arg0];
    }

    @ObfuscatedName("rl.ak(Ljava/lang/String;I)V")
    public final void method7276(String arg0) {
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        String var9 = class404.method3109(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field4683 = var9;
    }

    @ObfuscatedName("rl.am(Ljava/lang/String;B)V")
    public final void method7277(String arg0) {
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        String var9 = class404.method3109(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field4684 = var9;
    }

    @ObfuscatedName("rl.av(Lul;II)V")
    public final void method7292(class530 arg0, int arg1) {
        this.method7277(arg0.method8588());
        long var3 = arg0.method8573();
        this.method7276(class404.method3095(var3));
        this.field4680 = arg0.method8366();
        int var5;
        short var6;
        if (arg1 == 1) {
            var5 = arg0.method8365();
            var6 = 255;
        } else if (arg1 == 2) {
            var5 = arg0.method8382();
            var6 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var5 == var6) {
            return;
        }
        int var7 = var5;
        this.method7408();
        for (int var8 = 0; var8 < var7; var8++) {
            class447 var9 = (class447) this.method7365(new class553(arg0.method8588(), this.field4687));
            int var10 = arg0.method8598();
            var9.method7431(var10, ++this.field4686 - 1);
            var9.field4713 = arg0.method8366();
            arg0.method8588();
            this.method7281(var9);
        }
    }

    @ObfuscatedName("rl.ag(Lul;I)V")
    public final void method7275(class530 arg0) {
        class553 var2 = new class553(arg0.method8588(), this.field4687);
        int var3 = arg0.method8598();
        byte var4 = arg0.method8366();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method7406() == 0) {
                return;
            }
            class447 var6 = (class447) this.method7371(var2);
            if (var6 != null && var6.method7434() == var3) {
                this.method7356(var6);
            }
            return;
        }
        arg0.method8588();
        class447 var7 = (class447) this.method7371(var2);
        if (var7 == null) {
            if (this.method7406() > this.field4707) {
                return;
            }
            var7 = (class447) this.method7365(var2);
        }
        var7.method7431(var3, ++this.field4686 - 1);
        var7.field4713 = var4;
        this.method7281(var7);
    }

    @ObfuscatedName("rl.aa(B)V")
    public final void method7279() {
        for (int var1 = 0; var1 < this.method7406(); var1++) {
            ((class447) this.method7367(var1)).method7314();
        }
    }

    @ObfuscatedName("rl.ap(I)V")
    public final void method7280() {
        for (int var1 = 0; var1 < this.method7406(); var1++) {
            ((class447) this.method7367(var1)).method7316();
        }
    }

    @ObfuscatedName("rl.ay(Lrm;B)V")
    public final void method7281(class447 arg0) {
        if (arg0.method7329().equals(this.field4682.method1540())) {
            this.field4681 = arg0.field4713;
        }
    }
}
