package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ac")
public class class51 extends class52 {

    @ObfuscatedName("ac.g")
    public AudioFormat field1090;

    @ObfuscatedName("ac.h")
    public SourceDataLine field1088;

    @ObfuscatedName("ac.s")
    public int field1089;

    @ObfuscatedName("ac.o")
    public byte[] field1087;

    @ObfuscatedName("ac.g(Ljava/awt/Component;)V")
    public void method945(Component arg0) {
        this.field1090 = new AudioFormat((float) Statics.field1105, 16, Statics.field1092 ? 2 : 1, true, false);
        this.field1087 = new byte[0x100 << (Statics.field1092 ? 2 : 1)];
    }

    @ObfuscatedName("ac.h(I)V")
    public void method937(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1090, arg0 << (Statics.field1092 ? 2 : 1));
            this.field1088 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1088.open();
            this.field1088.start();
            this.field1089 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1088 = null;
                throw var11;
            } else {
                this.method937(class124.method11(arg0));
            }
        }
    }

    @ObfuscatedName("ac.s()I")
    public int method936() {
        return this.field1089 - (this.field1088.available() >> (Statics.field1092 ? 2 : 1));
    }

    @ObfuscatedName("ac.o()V")
    public void method939() {
        int var1 = 256;
        if (Statics.field1092) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1107[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1087[var2 * 2] = (byte) (var3 >> 8);
            this.field1087[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1088.write(this.field1087, 0, var1 << 1);
    }

    @ObfuscatedName("ac.p()V")
    public void method940() {
        if (this.field1088 != null) {
            this.field1088.close();
            this.field1088 = null;
        }
    }

    @ObfuscatedName("ac.x()V")
    public void method941() {
        this.field1088.flush();
    }
}
