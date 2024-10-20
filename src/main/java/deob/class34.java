package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aw")
public class class34 extends class21 {

    @ObfuscatedName("aw.s")
    public HashSet field293;

    @ObfuscatedName("aw.p")
    public HashSet field294;

    @ObfuscatedName("aw.g")
    public List field292;

    @ObfuscatedName("aw.bz(Lgy;Lgy;Lgy;IZI)V")
    public void method535(class183 arg0, class183 arg1, class183 arg2, int arg3, boolean arg4) {
        this.method202(arg0, arg3);
        int var6 = arg2.method3268();
        this.field293 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class11 var8 = new class11();
            try {
                var8.method105(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field293.add(var8);
        }
        int var10 = arg2.method3268();
        this.field294 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class35 var12 = new class35();
            try {
                var12.method543(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field294.add(var12);
        }
        this.method536(arg1, arg4);
    }

    @ObfuscatedName("aw.bq(Lgy;ZI)V")
    public void method536(class183 arg0, boolean arg1) {
        this.field292 = new LinkedList();
        int var3 = arg0.method3268();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3279();
            class227 var6 = new class227(arg0.method3267());
            boolean var7 = arg0.method3436() == 1;
            if (arg1 || !var7) {
                this.field292.add(new class14(var5, var6));
            }
        }
    }
}
