package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ar")
public class class45 extends class33 {

    @ObfuscatedName("ar.n")
    public HashSet field552;

    @ObfuscatedName("ar.c")
    public HashSet field557;

    @ObfuscatedName("ar.y")
    public List field553;

    @ObfuscatedName("ar.cc(Lfr;Lfr;Lfr;IZI)V")
    public void method562(class181 arg0, class181 arg1, class181 arg2, int arg3, boolean arg4) {
        this.method241(arg0, arg3);
        int var6 = arg2.method3179();
        this.field552 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method162(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field552.add(var8);
        }
        int var10 = arg2.method3179();
        this.field557 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method584(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field557.add(var12);
        }
        this.method559(arg1, arg4);
    }

    @ObfuscatedName("ar.ck(Lfr;ZI)V")
    public void method559(class181 arg0, boolean arg1) {
        this.field553 = new LinkedList();
        int var3 = arg0.method3179();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3184();
            class220 var6 = new class220(arg0.method3041());
            boolean var7 = arg0.method3204() == 1;
            if (arg1 || !var7) {
                this.field553.add(new class26(var5, var6));
            }
        }
    }
}
