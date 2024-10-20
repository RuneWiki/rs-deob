package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lj")
public class class292 extends class271 {

    @ObfuscatedName("lj.ay")
    public HashSet field3101;

    @ObfuscatedName("lj.as")
    public HashSet field3099;

    @ObfuscatedName("lj.aj")
    public List field3098;

    @ObfuscatedName("lj.cx(Lul;Lul;IZZI)V")
    public void method5203(class530 arg0, class530 arg1, int arg2, boolean arg3, boolean arg4) {
        this.method4851(arg0, arg2, arg4);
        int var6 = arg1.method8598();
        this.field3101 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class266 var8 = new class266();
            try {
                var8.method4782(arg1);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field3101.add(var8);
        }
        int var10 = arg1.method8598();
        this.field3099 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class274 var12 = new class274();
            try {
                var12.method5093(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3099.add(var12);
        }
        this.method5199(arg1, arg3);
    }

    @ObfuscatedName("lj.ch(Lul;ZB)V")
    public void method5199(class530 arg0, boolean arg1) {
        this.field3098 = new LinkedList();
        int var3 = arg0.method8598();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8385();
            class337 var6 = new class337(arg0.method8371());
            boolean var7 = arg0.method8365() == 1;
            if (arg1 || !var7) {
                this.field3098.add(new class277((class337) null, var6, var5, (class284) null));
            }
        }
    }
}
