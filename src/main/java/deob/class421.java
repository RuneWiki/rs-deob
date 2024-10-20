package deob;

@ObfuscatedName("qn")
public class class421 extends class427 {

    public class421(class427 arg0) {
        super(arg0);
        this.field4652 = "SwapSongTask";
    }

    @ObfuscatedName("qn.az(I)Z")
    public boolean method7146() {
        if (class322.field3496.size() > 1 && class322.field3496.get(0) != null && ((class334) class322.field3496.get(0)).field3614.method5448() && class322.field3496.get(1) != null && ((class334) class322.field3496.get(1)).field3614.method5448()) {
            class334 var1 = (class334) class322.field3496.get(0);
            class322.field3496.set(0, class322.field3496.get(1));
            class322.field3496.set(1, var1);
        }
        return true;
    }
}
