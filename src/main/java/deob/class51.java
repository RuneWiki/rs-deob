package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("aq")
public class class51 extends class52 {

    @ObfuscatedName("aq.q")
    public AudioFormat field1084;

    @ObfuscatedName("aq.c")
    public SourceDataLine field1082;

    @ObfuscatedName("aq.p")
    public int field1083;

    @ObfuscatedName("aq.z")
    public byte[] field1081;

    @ObfuscatedName("aq.q(Ljava/awt/Component;)V")
    public void method929(Component arg0) {
        this.field1084 = new AudioFormat((float) Statics.field1097, 16, Statics.field1034 ? 2 : 1, true, false);
        this.field1081 = new byte[0x100 << (Statics.field1034 ? 2 : 1)];
    }

    @ObfuscatedName("aq.c(I)V")
    public void method930(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1084, arg0 << (Statics.field1034 ? 2 : 1));
            this.field1082 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1082.open();
            this.field1082.start();
            this.field1083 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1082 = null;
                throw var11;
            } else {
                this.method930(class124.method212(arg0));
            }
        }
    }

    @ObfuscatedName("aq.p()I")
    public int method931() {
        return this.field1083 - (this.field1082.available() >> (Statics.field1034 ? 2 : 1));
    }

    @ObfuscatedName("aq.z()V")
    public void method940() {
        int var1 = 256;
        if (Statics.field1034) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1087[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1081[var2 * 2] = (byte) (var3 >> 8);
            this.field1081[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1082.write(this.field1081, 0, var1 << 1);
    }

    @ObfuscatedName("aq.m()V")
    public void method948() {
        if (this.field1082 != null) {
            this.field1082.close();
            this.field1082 = null;
        }
    }

    @ObfuscatedName("aq.k()V")
    public void method937() {
        this.field1082.flush();
    }
}
