package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("bq")
public class class78 {

    @ObfuscatedName("bq.s")
    public int field1217;

    @ObfuscatedName("bq.c")
    public class155 field1211;

    @ObfuscatedName("bq.f")
    public DataInputStream field1212;

    @ObfuscatedName("bq.m")
    public byte[] field1213 = new byte[4];

    @ObfuscatedName("bq.h")
    public int field1214;

    @ObfuscatedName("bq.t")
    public byte[] field1222;

    @ObfuscatedName("bq.p")
    public int field1216;

    @ObfuscatedName("bq.d")
    public long field1221;

    public class78(class156 arg0, URL arg1) {
        this.field1211 = arg0.method2765(arg1);
        this.field1217 = 0;
        this.field1221 = class179.method3585() + 30000L;
    }

    @ObfuscatedName("bq.s(I)[B")
    public byte[] method1392() throws IOException {
        if (class179.method3585() > this.field1221) {
            throw new IOException();
        }
        if (this.field1217 == 0) {
            if (this.field1211.field2238 == 2) {
                throw new IOException();
            }
            if (this.field1211.field2238 == 1) {
                this.field1212 = (DataInputStream) this.field1211.field2240;
                this.field1217 = 1;
            }
        }
        if (this.field1217 == 1) {
            this.field1214 += this.field1212.read(this.field1213, this.field1214, this.field1213.length - this.field1214);
            if (this.field1214 == 4) {
                int var1 = (new class177(this.field1213)).method2970();
                this.field1222 = new byte[var1];
                this.field1217 = 2;
            }
        }
        if (this.field1217 == 2) {
            this.field1216 += this.field1212.read(this.field1222, this.field1216, this.field1222.length - this.field1216);
            if (this.field1216 == this.field1222.length) {
                return this.field1222;
            }
        }
        return null;
    }
}
