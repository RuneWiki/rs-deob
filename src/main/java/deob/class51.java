package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ap")
public class class51 extends class52 {

    @ObfuscatedName("ap.g")
    public AudioFormat field1084;

    @ObfuscatedName("ap.m")
    public SourceDataLine field1082;

    @ObfuscatedName("ap.v")
    public int field1083;

    @ObfuscatedName("ap.r")
    public byte[] field1081;

    @ObfuscatedName("ap.g(Ljava/awt/Component;)V")
    public void method921(Component arg0) {
        this.field1084 = new AudioFormat((float) Statics.field1096, 16, Statics.field1085 ? 2 : 1, true, false);
        this.field1081 = new byte[0x100 << (Statics.field1085 ? 2 : 1)];
    }

    @ObfuscatedName("ap.m(I)V")
    public void method915(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1084, arg0 << (Statics.field1085 ? 2 : 1));
            this.field1082 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1082.open();
            this.field1082.start();
            this.field1083 = arg0;
        } catch (LineUnavailableException var11) {
            if (class124.method136(arg0) == 1) {
                this.field1082 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method915(var10);
        }
    }

    @ObfuscatedName("ap.v()I")
    public int method916() {
        return this.field1083 - (this.field1082.available() >> (Statics.field1085 ? 2 : 1));
    }

    @ObfuscatedName("ap.r()V")
    public void method917() {
        int var1 = 256;
        if (Statics.field1085) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1095[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1081[var2 * 2] = (byte) (var3 >> 8);
            this.field1081[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1082.write(this.field1081, 0, var1 << 1);
    }

    @ObfuscatedName("ap.n()V")
    public void method918() {
        if (this.field1082 != null) {
            this.field1082.close();
            this.field1082 = null;
        }
    }

    @ObfuscatedName("ap.i()V")
    public void method929() {
        this.field1082.flush();
    }
}
