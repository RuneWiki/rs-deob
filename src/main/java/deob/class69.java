package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bn")
public final class class69 implements Runnable {

    @ObfuscatedName("bn.j")
    public InputStream field1274;

    @ObfuscatedName("bn.y")
    public OutputStream field1272;

    @ObfuscatedName("bn.x")
    public Socket field1266;

    @ObfuscatedName("bn.z")
    public boolean field1267 = false;

    @ObfuscatedName("bn.c")
    public class73 field1268;

    @ObfuscatedName("bn.e")
    public class78 field1265;

    @ObfuscatedName("bn.s")
    public byte[] field1270;

    @ObfuscatedName("bn.i")
    public int field1271 = 0;

    @ObfuscatedName("bn.g")
    public int field1264 = 0;

    @ObfuscatedName("bn.q")
    public boolean field1273 = false;

    public class69(Socket arg0, class73 arg1) throws IOException {
        this.field1268 = arg1;
        this.field1266 = arg0;
        this.field1266.setSoTimeout(30000);
        this.field1266.setTcpNoDelay(true);
        this.field1274 = this.field1266.getInputStream();
        this.field1272 = this.field1266.getOutputStream();
    }

    @ObfuscatedName("bn.z(B)V")
    public void method1350() {
        if (this.field1267) {
            return;
        }
        synchronized (this) {
            this.field1267 = true;
            this.notifyAll();
        }
        if (this.field1265 != null) {
            while (this.field1265.field1399 == 0) {
                class125.method112(1L);
            }
            if (this.field1265.field1399 == 1) {
                try {
                    ((Thread) this.field1265.field1398).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1265 = null;
    }

    public void finalize() {
        this.method1350();
    }

    @ObfuscatedName("bn.c(B)I")
    public int method1352() throws IOException {
        return this.field1267 ? 0 : this.field1274.read();
    }

    @ObfuscatedName("bn.e(B)I")
    public int method1353() throws IOException {
        return this.field1267 ? 0 : this.field1274.available();
    }

    @ObfuscatedName("bn.s([BIII)V")
    public void method1354(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1267) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1274.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bn.i([BIIB)V")
    public void method1355(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1267) {
            return;
        }
        if (this.field1273) {
            this.field1273 = false;
            throw new IOException();
        }
        if (this.field1270 == null) {
            this.field1270 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1270[this.field1264] = arg0[arg1 + var5];
                this.field1264 = (this.field1264 + 1) % 5000;
                if ((this.field1271 + 4900) % 5000 == this.field1264) {
                    throw new IOException();
                }
            }
            if (this.field1265 == null) {
                this.field1265 = this.field1268.method1455(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1271 == this.field1264) {
                            if (this.field1267) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1271;
                        if (this.field1264 >= this.field1271) {
                            var4 = this.field1264 - this.field1271;
                        } else {
                            var4 = 5000 - this.field1271;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1272.write(this.field1270, var3, var4);
                    } catch (IOException var12) {
                        this.field1273 = true;
                    }
                    this.field1271 = (this.field1271 + var4) % 5000;
                    try {
                        if (this.field1271 == this.field1264) {
                            this.field1272.flush();
                        }
                    } catch (IOException var11) {
                        this.field1273 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1274 != null) {
                        this.field1274.close();
                    }
                    if (this.field1272 != null) {
                        this.field1272.close();
                    }
                    if (this.field1266 != null) {
                        this.field1266.close();
                    }
                } catch (IOException var10) {
                }
                this.field1270 = null;
                break;
            }
        } catch (Exception var15) {
            class79.method2299((String) null, var15);
        }
    }
}
