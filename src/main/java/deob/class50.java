package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ac")
public class class50 extends class51 {

    @ObfuscatedName("ac.v")
    public AudioFormat field1068;

    @ObfuscatedName("ac.f")
    public SourceDataLine field1069;

    @ObfuscatedName("ac.n")
    public int field1070;

    @ObfuscatedName("ac.c")
    public byte[] field1071;

    @ObfuscatedName("ac.v(Ljava/awt/Component;)V")
    public void method947(Component arg0) {
        this.field1068 = new AudioFormat((float) Statics.field1076, 16, Statics.field2772 ? 2 : 1, true, false);
        this.field1071 = new byte[0x100 << (Statics.field2772 ? 2 : 1)];
    }

    @ObfuscatedName("ac.f(I)V")
    public void method948(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1068, arg0 << (Statics.field2772 ? 2 : 1));
            this.field1069 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1069.open();
            this.field1069.start();
            this.field1070 = arg0;
        } catch (LineUnavailableException var11) {
            if (class123.method2225(arg0) == 1) {
                this.field1069 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method948(var10);
        }
    }

    @ObfuscatedName("ac.n()I")
    public int method934() {
        return this.field1070 - (this.field1069.available() >> (Statics.field2772 ? 2 : 1));
    }

    @ObfuscatedName("ac.c()V")
    public void method935() {
        int var1 = 256;
        if (Statics.field2772) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1073[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1071[var2 * 2] = (byte) (var3 >> 8);
            this.field1071[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1069.write(this.field1071, 0, var1 << 1);
    }

    @ObfuscatedName("ac.r()V")
    public void method936() {
        if (this.field1069 != null) {
            this.field1069.close();
            this.field1069 = null;
        }
    }

    @ObfuscatedName("ac.k()V")
    public void method933() {
        this.field1069.flush();
    }
}
