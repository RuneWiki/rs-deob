package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("je")
public class class263 extends class242 {

    @ObfuscatedName("je.b")
    public HashSet field3025;

    @ObfuscatedName("je.m")
    public HashSet field3023;

    @ObfuscatedName("je.t")
    public List field3021;

    @ObfuscatedName("je.cq(Lrd;Lrd;IZI)V")
    public void method4943(class474 arg0, class474 arg1, int arg2, boolean arg3) {
        this.method4562(arg0, arg2);
        int var5 = arg1.method8032();
        this.field3025 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class237 var7 = new class237();
            try {
                var7.method4501(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3025.add(var7);
        }
        int var9 = arg1.method8032();
        this.field3023 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class245 var11 = new class245();
            try {
                var11.method4832(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field3023.add(var11);
        }
        this.method4941(arg1, arg3);
    }

    @ObfuscatedName("je.cd(Lrd;ZI)V")
    public void method4941(class474 arg0, boolean arg1) {
        this.field3021 = new LinkedList();
        int var3 = arg0.method8032();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8029();
            class301 var6 = new class301(arg0.method7979());
            boolean var7 = arg0.method7964() == 1;
            if (arg1 || !var7) {
                this.field3021.add(new class248((class301) null, var6, var5, (class255) null));
            }
        }
    }
}
