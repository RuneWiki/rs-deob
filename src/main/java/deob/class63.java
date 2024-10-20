package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bj")
public class class63 extends class50 {

    @ObfuscatedName("bj.t")
    public AudioFormat field1189;

    @ObfuscatedName("bj.o")
    public SourceDataLine field1188;

    @ObfuscatedName("bj.aa")
    public int field1186;

    @ObfuscatedName("bj.ak")
    public byte[] field1187;

    @ObfuscatedName("bj.t(Ljava/awt/Component;)V")
    public void method913(Component arg0) {
        this.field1189 = new AudioFormat((float) Statics.field1088, 16, Statics.field1073 ? 2 : 1, true, false);
        this.field1187 = new byte[0x100 << (Statics.field1073 ? 2 : 1)];
    }

    @ObfuscatedName("bj.o(I)V")
    public void method915(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1189, arg0 << (Statics.field1073 ? 2 : 1));
            this.field1188 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1188.open();
            this.field1188.start();
            this.field1186 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1188 = null;
                throw var11;
            } else {
                this.method915(class113.method1855(arg0));
            }
        }
    }

    @ObfuscatedName("bj.i()I")
    public int method920() {
        return this.field1186 - (this.field1188.available() >> (Statics.field1073 ? 2 : 1));
    }

    @ObfuscatedName("bj.p()V")
    public void method916() {
        int var1 = 256;
        if (Statics.field1073) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1076[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1187[var2 * 2] = (byte) (var3 >> 8);
            this.field1187[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1188.write(this.field1187, 0, var1 << 1);
    }

    @ObfuscatedName("bj.c()V")
    public void method917() {
        if (this.field1188 != null) {
            this.field1188.close();
            this.field1188 = null;
        }
    }

    @ObfuscatedName("bj.y()V")
    public void method918() {
        this.field1188.flush();
    }
}
