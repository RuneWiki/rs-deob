package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ab")
public class class34 extends class21 {

    @ObfuscatedName("ab.v")
    public HashSet field310;

    @ObfuscatedName("ab.p")
    public HashSet field311;

    @ObfuscatedName("ab.n")
    public List field312;

    @ObfuscatedName("ab.cb(Lgg;Lgg;Lgg;IZI)V")
    public void method543(class185 arg0, class185 arg1, class185 arg2, int arg3, boolean arg4) {
        this.method204(arg0, arg3);
        int var6 = arg2.method3245();
        this.field310 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class11 var8 = new class11();
            try {
                var8.method114(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field310.add(var8);
        }
        int var10 = arg2.method3245();
        this.field311 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class35 var12 = new class35();
            try {
                var12.method574(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field311.add(var12);
        }
        this.method547(arg1, arg4);
    }

    @ObfuscatedName("ab.cg(Lgg;ZB)V")
    public void method547(class185 arg0, boolean arg1) {
        this.field312 = new LinkedList();
        int var3 = arg0.method3245();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3338();
            class229 var6 = new class229(arg0.method3323());
            boolean var7 = arg0.method3243() == 1;
            if (arg1 || !var7) {
                this.field312.add(new class14(var5, var6));
            }
        }
    }
}
