package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("an")
public class class45 extends class33 {

    @ObfuscatedName("an.a")
    public HashSet field598;

    @ObfuscatedName("an.p")
    public HashSet field595;

    @ObfuscatedName("an.q")
    public List field594;

    @ObfuscatedName("an.bh(Lfi;Lfi;Lfi;IZI)V")
    public void method554(class177 arg0, class177 arg1, class177 arg2, int arg3, boolean arg4) {
        this.method319(arg0, arg3);
        int var6 = arg2.method2886();
        this.field598 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method154(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field598.add(var8);
        }
        int var10 = arg2.method2886();
        this.field595 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method563(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field595.add(var12);
        }
        this.method550(arg1, arg4);
    }

    @ObfuscatedName("an.bi(Lfi;ZI)V")
    public void method550(class177 arg0, boolean arg1) {
        this.field594 = new LinkedList();
        int var3 = arg0.method2886();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2899();
            class216 var6 = new class216(arg0.method2904());
            boolean var7 = arg0.method2931() == 1;
            if (arg1 || !var7) {
                this.field594.add(new class26(var5, var6));
            }
        }
    }
}
