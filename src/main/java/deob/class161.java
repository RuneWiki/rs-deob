package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fy")
public final class class161 implements Runnable {

    @ObfuscatedName("fy.e")
    public InputStream field2258;

    @ObfuscatedName("fy.n")
    public OutputStream field2256;

    @ObfuscatedName("fy.g")
    public Socket field2251;

    @ObfuscatedName("fy.y")
    public boolean field2250 = false;

    @ObfuscatedName("fy.w")
    public class156 field2255;

    @ObfuscatedName("fy.k")
    public class155 field2254;

    @ObfuscatedName("fy.v")
    public byte[] field2252;

    @ObfuscatedName("fy.z")
    public int field2249 = 0;

    @ObfuscatedName("fy.r")
    public int field2257 = 0;

    @ObfuscatedName("fy.u")
    public boolean field2253 = false;

    public class161(Socket arg0, class156 arg1) throws IOException {
        this.field2255 = arg1;
        this.field2251 = arg0;
        this.field2251.setSoTimeout(30000);
        this.field2251.setTcpNoDelay(true);
        this.field2251.setReceiveBufferSize(16384);
        this.field2251.setSendBufferSize(16384);
        this.field2258 = this.field2251.getInputStream();
        this.field2256 = this.field2251.getOutputStream();
    }

    @ObfuscatedName("fy.e(B)V")
    public void method2792() {
        if (this.field2250) {
            return;
        }
        synchronized (this) {
            this.field2250 = true;
            this.notifyAll();
        }
        if (this.field2254 != null) {
            while (this.field2254.field2211 == 0) {
                class183.method534(1L);
            }
            if (this.field2254.field2211 == 1) {
                try {
                    ((Thread) this.field2254.field2215).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2254 = null;
    }

    public void finalize() {
        this.method2792();
    }

    @ObfuscatedName("fy.n(B)I")
    public int method2786() throws IOException {
        return this.field2250 ? 0 : this.field2258.read();
    }

    @ObfuscatedName("fy.g(I)I")
    public int method2787() throws IOException {
        return this.field2250 ? 0 : this.field2258.available();
    }

    @ObfuscatedName("fy.y([BIII)V")
    public void method2789(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2250) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2258.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fy.w([BIII)V")
    public void method2785(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2250) {
            return;
        }
        if (this.field2253) {
            this.field2253 = false;
            throw new IOException();
        }
        if (this.field2252 == null) {
            this.field2252 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2252[this.field2257] = arg0[arg1 + var5];
                this.field2257 = (this.field2257 + 1) % 5000;
                if ((this.field2249 + 4900) % 5000 == this.field2257) {
                    throw new IOException();
                }
            }
            if (this.field2254 == null) {
                this.field2254 = this.field2255.method2731(this, 3);
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
                        if (this.field2257 == this.field2249) {
                            if (this.field2250) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2249;
                        if (this.field2257 >= this.field2249) {
                            var4 = this.field2257 - this.field2249;
                        } else {
                            var4 = 5000 - this.field2249;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2256.write(this.field2252, var3, var4);
                    } catch (IOException var12) {
                        this.field2253 = true;
                    }
                    this.field2249 = (this.field2249 + var4) % 5000;
                    try {
                        if (this.field2257 == this.field2249) {
                            this.field2256.flush();
                        }
                    } catch (IOException var11) {
                        this.field2253 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2258 != null) {
                        this.field2258.close();
                    }
                    if (this.field2256 != null) {
                        this.field2256.close();
                    }
                    if (this.field2251 != null) {
                        this.field2251.close();
                    }
                } catch (IOException var10) {
                }
                this.field2252 = null;
                break;
            }
        } catch (Exception var15) {
            class154.method1592((String) null, var15);
        }
    }
}
