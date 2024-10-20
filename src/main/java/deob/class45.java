package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("az")
public class class45 extends class33 {

    @ObfuscatedName("az.z")
    public HashSet field608;

    @ObfuscatedName("az.l")
    public HashSet field609;

    @ObfuscatedName("az.c")
    public List field607;

    @ObfuscatedName("az.by(Lfp;Lfp;Lfp;IZB)V")
    public void method560(class174 arg0, class174 arg1, class174 arg2, int arg3, boolean arg4) {
        this.method278(arg0, arg3);
        int var6 = arg2.method2882();
        this.field608 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method148(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field608.add(var8);
        }
        int var10 = arg2.method2882();
        this.field609 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method570(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field609.add(var12);
        }
        this.method565(arg1, arg4);
    }

    @ObfuscatedName("az.bq(Lfp;ZI)V")
    public void method565(class174 arg0, boolean arg1) {
        this.field607 = new LinkedList();
        int var3 = arg0.method2882();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2864();
            class213 var6 = new class213(arg0.method2885());
            boolean var7 = arg0.method3061() == 1;
            if (arg1 || !var7) {
                this.field607.add(new class26(var5, var6));
            }
        }
    }
}
