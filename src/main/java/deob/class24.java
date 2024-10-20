package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("n")
public class class24 {

    @ObfuscatedName("n.t")
    public int field400;

    @ObfuscatedName("n.l")
    public class79 field393;

    @ObfuscatedName("n.c")
    public DataInputStream field401;

    @ObfuscatedName("n.d")
    public byte[] field395 = new byte[4];

    @ObfuscatedName("n.b")
    public int field396;

    @ObfuscatedName("n.i")
    public byte[] field397;

    @ObfuscatedName("n.p")
    public int field398;

    @ObfuscatedName("n.y")
    public long field399;

    public class24(class74 arg0, URL arg1) {
        this.field393 = arg0.method1506(arg1);
        this.field400 = 0;
        this.field399 = class121.method2693() + 30000L;
    }

    @ObfuscatedName("n.t(I)[B")
    public byte[] method235() throws IOException {
        if (class121.method2693() > this.field399) {
            throw new IOException();
        }
        if (this.field400 == 0) {
            if (this.field393.field1446 == 2) {
                throw new IOException();
            }
            if (this.field393.field1446 == 1) {
                this.field401 = (DataInputStream) this.field393.field1442;
                this.field400 = 1;
            }
        }
        if (this.field400 == 1) {
            int var1 = this.field401.available();
            if (var1 > 0) {
                if (this.field396 + var1 > 4) {
                    var1 = 4 - this.field396;
                }
                this.field396 += this.field401.read(this.field395, this.field396, var1);
                if (this.field396 == 4) {
                    int var2 = (new class127(this.field395)).method2448();
                    this.field397 = new byte[var2];
                    this.field400 = 2;
                }
            }
        }
        if (this.field400 == 2) {
            int var3 = this.field401.available();
            if (var3 > 0) {
                if (this.field398 + var3 > this.field397.length) {
                    var3 = this.field397.length - this.field398;
                }
                this.field398 += this.field401.read(this.field397, this.field398, var3);
                if (this.field398 == this.field397.length) {
                    return this.field397;
                }
            }
        }
        return null;
    }
}
