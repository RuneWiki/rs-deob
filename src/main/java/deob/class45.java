package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ah")
public class class45 extends class33 {

    @ObfuscatedName("ah.u")
    public HashSet field573;

    @ObfuscatedName("ah.k")
    public HashSet field576;

    @ObfuscatedName("ah.e")
    public List field575;

    @ObfuscatedName("ah.ba(Lfs;Lfs;Lfs;IZI)V")
    public void method543(class177 arg0, class177 arg1, class177 arg2, int arg3, boolean arg4) {
        this.method251(arg0, arg3);
        int var6 = arg2.method2967();
        this.field573 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method161(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field573.add(var8);
        }
        int var10 = arg2.method2967();
        this.field576 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method553(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field576.add(var12);
        }
        this.method544(arg1, arg4);
    }

    @ObfuscatedName("ah.bq(Lfs;ZI)V")
    public void method544(class177 arg0, boolean arg1) {
        this.field575 = new LinkedList();
        int var3 = arg0.method2967();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2980();
            class216 var6 = new class216(arg0.method2970());
            boolean var7 = arg0.method2965() == 1;
            if (arg1 || !var7) {
                this.field575.add(new class26(var5, var6));
            }
        }
    }
}
