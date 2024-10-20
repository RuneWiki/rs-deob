package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("n")
public class class17 {

    @ObfuscatedName("n.e")
    public int field240;

    @ObfuscatedName("n.p")
    public class133 field250;

    @ObfuscatedName("n.a")
    public DataInputStream field241;

    @ObfuscatedName("n.g")
    public byte[] field239 = new byte[4];

    @ObfuscatedName("n.u")
    public int field243;

    @ObfuscatedName("n.k")
    public byte[] field244;

    @ObfuscatedName("n.m")
    public int field245;

    @ObfuscatedName("n.t")
    public long field246;

    public class17(class123 arg0, URL arg1) {
        this.field250 = arg0.method2485(arg1);
        this.field240 = 0;
        this.field246 = class103.method527() + 30000L;
    }

    @ObfuscatedName("n.e(I)[B")
    public byte[] method150() throws IOException {
        if (class103.method527() > this.field246) {
            throw new IOException();
        }
        if (this.field240 == 0) {
            if (this.field250.field2071 == 2) {
                throw new IOException();
            }
            if (this.field250.field2071 == 1) {
                this.field241 = (DataInputStream) this.field250.field2067;
                this.field240 = 1;
            }
        }
        if (this.field240 == 1) {
            int var1 = this.field241.available();
            if (var1 > 0) {
                if (this.field243 + var1 > 4) {
                    var1 = 4 - this.field243;
                }
                this.field243 += this.field241.read(this.field239, this.field243, var1);
                if (this.field243 == 4) {
                    int var2 = (new class107(this.field239)).method2146();
                    this.field244 = new byte[var2];
                    this.field240 = 2;
                }
            }
        }
        if (this.field240 == 2) {
            int var3 = this.field241.available();
            if (var3 > 0) {
                if (this.field245 + var3 > this.field244.length) {
                    var3 = this.field244.length - this.field245;
                }
                this.field245 += this.field241.read(this.field244, this.field245, var3);
                if (this.field245 == this.field244.length) {
                    return this.field244;
                }
            }
        }
        return null;
    }
}
