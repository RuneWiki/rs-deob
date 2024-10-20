package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ba")
public final class class70 implements Runnable {

    @ObfuscatedName("ba.j")
    public InputStream field1279;

    @ObfuscatedName("ba.r")
    public OutputStream field1267;

    @ObfuscatedName("ba.v")
    public Socket field1269;

    @ObfuscatedName("ba.p")
    public boolean field1270 = false;

    @ObfuscatedName("ba.e")
    public class74 field1278;

    @ObfuscatedName("ba.d")
    public class79 field1276;

    @ObfuscatedName("ba.y")
    public byte[] field1273;

    @ObfuscatedName("ba.x")
    public int field1274 = 0;

    @ObfuscatedName("ba.t")
    public int field1271 = 0;

    @ObfuscatedName("ba.i")
    public boolean field1277 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1278 = arg1;
        this.field1269 = arg0;
        this.field1269.setSoTimeout(30000);
        this.field1269.setTcpNoDelay(true);
        this.field1279 = this.field1269.getInputStream();
        this.field1267 = this.field1269.getOutputStream();
    }

    @ObfuscatedName("ba.v(B)V")
    public void method1375() {
        if (this.field1270) {
            return;
        }
        synchronized (this) {
            this.field1270 = true;
            this.notifyAll();
        }
        if (this.field1276 != null) {
            while (this.field1276.field1394 == 0) {
                class126.method1316(1L);
            }
            if (this.field1276.field1394 == 1) {
                try {
                    ((Thread) this.field1276.field1391).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1276 = null;
    }

    public void finalize() {
        this.method1375();
    }

    @ObfuscatedName("ba.p(I)I")
    public int method1377() throws IOException {
        return this.field1270 ? 0 : this.field1279.read();
    }

    @ObfuscatedName("ba.e(I)I")
    public int method1379() throws IOException {
        return this.field1270 ? 0 : this.field1279.available();
    }

    @ObfuscatedName("ba.d([BIII)V")
    public void method1390(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1270) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1279.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ba.y([BIIB)V")
    public void method1380(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1270) {
            return;
        }
        if (this.field1277) {
            this.field1277 = false;
            throw new IOException();
        }
        if (this.field1273 == null) {
            this.field1273 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1273[this.field1271] = arg0[arg1 + var5];
                this.field1271 = (this.field1271 + 1) % 5000;
                if ((this.field1274 + 4900) % 5000 == this.field1271) {
                    throw new IOException();
                }
            }
            if (this.field1276 == null) {
                this.field1276 = this.field1278.method1479(this, 3);
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
                        if (this.field1274 == this.field1271) {
                            if (this.field1270) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1274;
                        if (this.field1271 >= this.field1274) {
                            var4 = this.field1271 - this.field1274;
                        } else {
                            var4 = 5000 - this.field1274;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1267.write(this.field1273, var3, var4);
                    } catch (IOException var12) {
                        this.field1277 = true;
                    }
                    this.field1274 = (this.field1274 + var4) % 5000;
                    try {
                        if (this.field1274 == this.field1271) {
                            this.field1267.flush();
                        }
                    } catch (IOException var11) {
                        this.field1277 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1279 != null) {
                        this.field1279.close();
                    }
                    if (this.field1267 != null) {
                        this.field1267.close();
                    }
                    if (this.field1269 != null) {
                        this.field1269.close();
                    }
                } catch (IOException var10) {
                }
                this.field1273 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method2830((String) null, var15);
        }
    }
}
