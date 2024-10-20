package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bl")
public class class74 {

    @ObfuscatedName("bl.z")
    public static int field1044 = 6;

    @ObfuscatedName("bl.v")
    public boolean field1037;

    @ObfuscatedName("bl.u")
    public boolean field1038;

    @ObfuscatedName("bl.r")
    public int field1039 = 1;

    @ObfuscatedName("bl.p")
    public String field1035 = null;

    @ObfuscatedName("bl.q")
    public boolean field1041 = false;

    @ObfuscatedName("bl.m")
    public LinkedHashMap field1042 = new LinkedHashMap();

    public class74() {
        this.method1666(true);
    }

    public class74(class300 arg0) {
        if (arg0 == null || arg0.field3699 == null) {
            this.method1666(true);
        } else {
            int var2 = arg0.method4990();
            if (var2 >= 0 && var2 <= field1044) {
                if (arg0.method4990() == 1) {
                    this.field1037 = true;
                }
                if (var2 > 1) {
                    this.field1038 = arg0.method4990() == 1;
                }
                if (var2 > 3) {
                    this.field1039 = arg0.method4990();
                }
                if (var2 > 2) {
                    int var3 = arg0.method4990();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5085();
                        int var6 = arg0.method5085();
                        this.field1042.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1035 = arg0.method4998();
                }
                if (var2 > 5) {
                    this.field1041 = arg0.method4997();
                }
            } else {
                this.method1666(true);
            }
        }
    }

    @ObfuscatedName("bl.z(ZI)V")
    public void method1666(boolean arg0) {
    }

    @ObfuscatedName("bl.n(I)Lkl;")
    public class300 method1667() {
        class300 var1 = new class300(100);
        var1.method5065(field1044);
        var1.method5065(this.field1037 ? 1 : 0);
        var1.method5065(this.field1038 ? 1 : 0);
        var1.method5065(this.field1039);
        var1.method5065(this.field1042.size());
        Iterator var2 = this.field1042.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method4977((Integer) var3.getKey());
            var1.method4977((Integer) var3.getValue());
        }
        var1.method4981(this.field1035 == null ? "" : this.field1035);
        var1.method4980(this.field1041);
        return var1;
    }

    @ObfuscatedName("it.v(B)Lbl;")
    public static class74 method4263() {
        class343 var0 = null;
        class74 var1 = new class74();
        try {
            var0 = class168.method3269("", Statics.field102.field3094, false);
            byte[] var2 = new byte[(int) var0.method5982()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method5983(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class74(new class300(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method5997();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("gt.u(S)V")
    public static void method3302() {
        class343 var0 = null;
        try {
            var0 = class168.method3269("", Statics.field102.field3094, true);
            class300 var1 = Statics.field3112.method1667();
            var0.method5993(var1.field3699, 0, var1.field3702);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method5977(true);
            }
        } catch (Exception var4) {
        }
    }
}
