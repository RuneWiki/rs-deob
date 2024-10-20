package deob;

@ObfuscatedName("ro")
public class class466 extends class472 {

    @ObfuscatedName("ro.al")
    public final class524 field4905;

    @ObfuscatedName("ro.aj")
    public final class464 field4906;

    @ObfuscatedName("ro.az")
    public String field4907 = null;

    @ObfuscatedName("ro.af")
    public String field4904 = null;

    @ObfuscatedName("ro.aa")
    public byte field4909;

    @ObfuscatedName("ro.at")
    public int field4910;

    @ObfuscatedName("ro.ab")
    public int field4911 = 1;

    public class466(class524 arg0, class464 arg1) {
        super(500);
        this.field4905 = arg0;
        this.field4906 = arg1;
    }

    @ObfuscatedName("ro.ak(B)Lsg;")
    public class470 method7796() {
        return new class469();
    }

    @ObfuscatedName("ro.al(II)[Lsg;")
    public class470[] method7805(int arg0) {
        return new class469[arg0];
    }

    @ObfuscatedName("ro.aj(Ljava/lang/String;I)V")
    public final void method7816(String arg0) {
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
        String var9 = class417.method3190(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field4907 = var9;
    }

    @ObfuscatedName("ro.at(Ljava/lang/String;S)V")
    public final void method7817(String arg0) {
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
        String var9 = class417.method3190(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field4904 = var9;
    }

    @ObfuscatedName("ro.ah(Lua;II)V")
    public final void method7818(class546 arg0, int arg1) {
        this.method7817(arg0.method8806());
        long var3 = arg0.method8802();
        long var5 = var3;
        String var7;
        if (var3 <= 0L || var3 >= 6582952005840035281L) {
            var7 = null;
        } else if (var3 % 37L == 0L) {
            var7 = null;
        } else {
            int var8 = 0;
            for (long var9 = var3; var9 != 0L; var9 /= 37L) {
                var8++;
            }
            StringBuilder var11 = new StringBuilder(var8);
            while (var5 != 0L) {
                long var12 = var5;
                var5 /= 37L;
                var11.append(class417.field4665[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method7816(var7);
        this.field4909 = arg0.method8797();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method8796();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method8811();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method7907();
        for (int var17 = 0; var17 < var16; var17++) {
            class469 var18 = (class469) this.method7980(new class568(arg0.method8806(), this.field4905));
            int var19 = arg0.method8798();
            var18.method7989(var19, ++this.field4911 - 1);
            var18.field4934 = arg0.method8797();
            arg0.method8806();
            this.method7821(var18);
        }
    }

    @ObfuscatedName("ro.av(Lua;I)V")
    public final void method7819(class546 arg0) {
        class568 var2 = new class568(arg0.method8806(), this.field4905);
        int var3 = arg0.method8798();
        byte var4 = arg0.method8797();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method7931() == 0) {
                return;
            }
            class469 var6 = (class469) this.method7912(var2);
            if (var6 != null && var6.method7994() == var3) {
                this.method7970(var6);
            }
            return;
        }
        arg0.method8806();
        class469 var7 = (class469) this.method7912(var2);
        if (var7 == null) {
            if (this.method7931() > this.field4926) {
                return;
            }
            var7 = (class469) this.method7980(var2);
        }
        var7.method7989(var3, ++this.field4911 - 1);
        var7.field4934 = var4;
        this.method7821(var7);
    }

    @ObfuscatedName("ro.aq(I)V")
    public final void method7830() {
        for (int var1 = 0; var1 < this.method7931(); var1++) {
            ((class469) this.method7951(var1)).method7859();
        }
    }

    @ObfuscatedName("ro.ap(B)V")
    public final void method7831() {
        for (int var1 = 0; var1 < this.method7931(); var1++) {
            ((class469) this.method7951(var1)).method7862();
        }
    }

    @ObfuscatedName("ro.ae(Lsn;B)V")
    public final void method7821(class469 arg0) {
        if (arg0.method7890().equals(this.field4906.method1185())) {
            this.field4910 = arg0.field4934;
        }
    }
}
