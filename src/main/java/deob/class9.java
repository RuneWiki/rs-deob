package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("a")
public class class9 {

    @ObfuscatedName("a.j")
    public static int field144 = 4;

    @ObfuscatedName("a.z")
    public boolean field145;

    @ObfuscatedName("a.l")
    public boolean field146;

    @ObfuscatedName("a.w")
    public int field148 = 1;

    @ObfuscatedName("a.d")
    public LinkedHashMap field150 = new LinkedHashMap();

    public class9() {
        this.method121(true);
    }

    public class9(class114 arg0) {
        if (arg0 == null || arg0.field1891 == null) {
            this.method121(true);
        } else {
            int var2 = arg0.method2322();
            if (var2 >= 0 && var2 <= field144) {
                if (arg0.method2322() == 1) {
                    this.field145 = true;
                }
                if (var2 > 1) {
                    this.field146 = arg0.method2322() == 1;
                }
                if (var2 > 3) {
                    this.field148 = arg0.method2322();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2322();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2327();
                        int var6 = arg0.method2327();
                        this.field150.put(var5, var6);
                    }
                }
            } else {
                this.method121(true);
            }
        }
    }

    @ObfuscatedName("a.j(ZI)V")
    public void method121(boolean arg0) {
    }

    @ObfuscatedName("a.y(B)Lde;")
    public class114 method108() {
        class114 var1 = new class114(100);
        var1.method2307(field144);
        var1.method2307(this.field145 ? 1 : 0);
        var1.method2307(this.field146 ? 1 : 0);
        var1.method2307(this.field148);
        var1.method2307(this.field150.size());
        Iterator var2 = this.field150.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2310((Integer) var3.getKey());
            var1.method2310((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("dm.z(I)La;")
    public static class9 method2570() {
        class221 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class144.method99("", Statics.field305.field2198, false);
            byte[] var2 = new byte[(int) var0.method3762()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3755(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class114(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3767();
            }
        } catch (Exception var7) {
        }
        return var1;
    }
}
