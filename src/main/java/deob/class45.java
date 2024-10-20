package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("as")
public class class45 extends class33 {

    @ObfuscatedName("as.l")
    public HashSet field581;

    @ObfuscatedName("as.h")
    public HashSet field578;

    @ObfuscatedName("as.s")
    public List field579;

    @ObfuscatedName("as.bt(Lfh;Lfh;Lfh;IZB)V")
    public void method544(class175 arg0, class175 arg1, class175 arg2, int arg3, boolean arg4) {
        this.method286(arg0, arg3);
        int var6 = arg2.method3091();
        this.field581 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method155(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field581.add(var8);
        }
        int var10 = arg2.method3091();
        this.field578 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method553(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field578.add(var12);
        }
        this.method545(arg1, arg4);
    }

    @ObfuscatedName("as.bw(Lfh;ZI)V")
    public void method545(class175 arg0, boolean arg1) {
        this.field579 = new LinkedList();
        int var3 = arg0.method3091();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2943();
            class214 var6 = new class214(arg0.method2933());
            boolean var7 = arg0.method2928() == 1;
            if (arg1 || !var7) {
                this.field579.add(new class26(var5, var6));
            }
        }
    }
}
