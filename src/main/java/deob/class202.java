package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("gj")
public class class202 extends class181 {

    @ObfuscatedName("gj.k")
    public HashSet field2222;

    @ObfuscatedName("gj.t")
    public HashSet field2219;

    @ObfuscatedName("gj.l")
    public List field2221;

    @ObfuscatedName("gj.bp(Lop;Lop;IZB)V")
    public void method3599(class401 arg0, class401 arg1, int arg2, boolean arg3) {
        this.method3266(arg0, arg2);
        int var5 = arg1.method6242();
        this.field2222 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class176 var7 = new class176();
            try {
                var7.method3194(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2222.add(var7);
        }
        int var9 = arg1.method6242();
        this.field2219 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class184 var11 = new class184();
            try {
                var11.method3495(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2219.add(var11);
        }
        this.method3603(arg1, arg3);
    }

    @ObfuscatedName("gj.bn(Lop;ZI)V")
    public void method3603(class401 arg0, boolean arg1) {
        this.field2221 = new LinkedList();
        int var3 = arg0.method6242();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method6220();
            class258 var6 = new class258(arg0.method6245());
            boolean var7 = arg0.method6240() == 1;
            if (arg1 || !var7) {
                this.field2221.add(new class187((class258) null, var6, var5, (class194) null));
            }
        }
    }
}
