package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("gx")
public class class202 extends class181 {

    @ObfuscatedName("gx.g")
    public HashSet field2223;

    @ObfuscatedName("gx.v")
    public HashSet field2224;

    @ObfuscatedName("gx.s")
    public List field2225;

    @ObfuscatedName("gx.cy(Lot;Lot;IZI)V")
    public void method3592(class401 arg0, class401 arg1, int arg2, boolean arg3) {
        this.method3234(arg0, arg2);
        int var5 = arg1.method6284();
        this.field2223 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class176 var7 = new class176();
            try {
                var7.method3171(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2223.add(var7);
        }
        int var9 = arg1.method6284();
        this.field2224 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class184 var11 = new class184();
            try {
                var11.method3472(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2224.add(var11);
        }
        this.method3594(arg1, arg3);
    }

    @ObfuscatedName("gx.cg(Lot;ZI)V")
    public void method3594(class401 arg0, boolean arg1) {
        this.field2225 = new LinkedList();
        int var3 = arg0.method6284();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method6353();
            class258 var6 = new class258(arg0.method6277());
            boolean var7 = arg0.method6272() == 1;
            if (arg1 || !var7) {
                this.field2225.add(new class187((class258) null, var6, var5, (class194) null));
            }
        }
    }
}
