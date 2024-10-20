package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aq")
public class class46 extends class33 {

    @ObfuscatedName("aq.c")
    public HashSet field557;

    @ObfuscatedName("aq.v")
    public HashSet field556;

    @ObfuscatedName("aq.u")
    public List field555;

    @ObfuscatedName("aq.cu(Lgb;Lgb;Lgb;IZI)V")
    public void method595(class195 arg0, class195 arg1, class195 arg2, int arg3, boolean arg4) {
        this.method252(arg0, arg3);
        int var6 = arg2.method3238();
        this.field557 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method164(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field557.add(var8);
        }
        int var10 = arg2.method3238();
        this.field556 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class47 var12 = new class47();
            try {
                var12.method608(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field556.add(var12);
        }
        this.method596(arg1, arg4);
    }

    @ObfuscatedName("aq.cs(Lgb;ZI)V")
    public void method596(class195 arg0, boolean arg1) {
        this.field555 = new LinkedList();
        int var3 = arg0.method3238();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3252();
            class239 var6 = new class239(arg0.method3241());
            boolean var7 = arg0.method3236() == 1;
            if (arg1 || !var7) {
                this.field555.add(new class26(var5, var6));
            }
        }
    }
}
