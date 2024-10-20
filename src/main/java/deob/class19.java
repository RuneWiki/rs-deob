package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("k")
public class class19 {

    @ObfuscatedName("k.i")
    public byte[] field285 = new byte[4];

    @ObfuscatedName("k.h")
    public int field287;

    @ObfuscatedName("k.e")
    public class150 field280;

    @ObfuscatedName("k.g")
    public DataInputStream field279;

    @ObfuscatedName("k.n")
    public int field278;

    @ObfuscatedName("k.u")
    public byte[] field282;

    @ObfuscatedName("k.d")
    public int field283;

    @ObfuscatedName("k.l")
    public long field284;

    public class19(class140 arg0, URL arg1) {
        this.field280 = arg0.method2775(arg1);
        this.field287 = 0;
        this.field284 = class119.method719() + 30000L;
    }

    @ObfuscatedName("k.i(I)[B")
    public byte[] method189() throws IOException {
        if (class119.method719() > this.field284) {
            throw new IOException();
        }
        if (this.field287 == 0) {
            if (this.field280.field2266 == 2) {
                throw new IOException();
            }
            if (this.field280.field2266 == 1) {
                this.field279 = (DataInputStream) this.field280.field2271;
                this.field287 = 1;
            }
        }
        if (this.field287 == 1) {
            int var1 = this.field279.available();
            if (var1 > 0) {
                if (this.field278 + var1 > 4) {
                    var1 = 4 - this.field278;
                }
                this.field278 += this.field279.read(this.field285, this.field278, var1);
                if (this.field278 == 4) {
                    int var2 = (new class123(this.field285)).method2409();
                    this.field282 = new byte[var2];
                    this.field287 = 2;
                }
            }
        }
        if (this.field287 == 2) {
            int var3 = this.field279.available();
            if (var3 > 0) {
                if (this.field283 + var3 > this.field282.length) {
                    var3 = this.field282.length - this.field283;
                }
                this.field283 += this.field279.read(this.field282, this.field283, var3);
                if (this.field283 == this.field282.length) {
                    return this.field282;
                }
            }
        }
        return null;
    }
}
