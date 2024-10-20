package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ft")
public final class class160 implements Runnable {

    @ObfuscatedName("ft.i")
    public OutputStream field2248;

    @ObfuscatedName("ft.h")
    public InputStream field2250;

    @ObfuscatedName("ft.u")
    public Socket field2249;

    @ObfuscatedName("ft.q")
    public boolean field2252 = false;

    @ObfuscatedName("ft.g")
    public class155 field2251;

    @ObfuscatedName("ft.v")
    public class154 field2254;

    @ObfuscatedName("ft.t")
    public byte[] field2253;

    @ObfuscatedName("ft.p")
    public int field2247 = 0;

    @ObfuscatedName("ft.l")
    public int field2255 = 0;

    @ObfuscatedName("ft.a")
    public boolean field2256 = false;

    public class160(Socket arg0, class155 arg1) throws IOException {
        this.field2251 = arg1;
        this.field2249 = arg0;
        this.field2249.setSoTimeout(30000);
        this.field2249.setTcpNoDelay(true);
        this.field2249.setReceiveBufferSize(16384);
        this.field2249.setSendBufferSize(16384);
        this.field2250 = this.field2249.getInputStream();
        this.field2248 = this.field2249.getOutputStream();
    }

    @ObfuscatedName("ft.i(I)V")
    public void method2784() {
        if (this.field2252) {
            return;
        }
        synchronized (this) {
            this.field2252 = true;
            this.notifyAll();
        }
        if (this.field2254 != null) {
            while (this.field2254.field2210 == 0) {
                class182.method138(1L);
            }
            if (this.field2254.field2210 == 1) {
                try {
                    ((Thread) this.field2254.field2212).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2254 = null;
    }

    public void finalize() {
        this.method2784();
    }

    @ObfuscatedName("ft.h(I)I")
    public int method2787() throws IOException {
        return this.field2252 ? 0 : this.field2250.read();
    }

    @ObfuscatedName("ft.u(B)I")
    public int method2770() throws IOException {
        return this.field2252 ? 0 : this.field2250.available();
    }

    @ObfuscatedName("ft.q([BIII)V")
    public void method2779(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2252) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2250.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ft.g([BIII)V")
    public void method2769(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2252) {
            return;
        }
        if (this.field2256) {
            this.field2256 = false;
            throw new IOException();
        }
        if (this.field2253 == null) {
            this.field2253 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2253[this.field2255] = arg0[arg1 + var5];
                this.field2255 = (this.field2255 + 1) % 5000;
                if ((this.field2247 + 4900) % 5000 == this.field2255) {
                    throw new IOException();
                }
            }
            if (this.field2254 == null) {
                this.field2254 = this.field2251.method2715(this, 3);
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
                        if (this.field2255 == this.field2247) {
                            if (this.field2252) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2247;
                        if (this.field2255 >= this.field2247) {
                            var4 = this.field2255 - this.field2247;
                        } else {
                            var4 = 5000 - this.field2247;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2248.write(this.field2253, var3, var4);
                    } catch (IOException var12) {
                        this.field2256 = true;
                    }
                    this.field2247 = (this.field2247 + var4) % 5000;
                    try {
                        if (this.field2255 == this.field2247) {
                            this.field2248.flush();
                        }
                    } catch (IOException var11) {
                        this.field2256 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2250 != null) {
                        this.field2250.close();
                    }
                    if (this.field2248 != null) {
                        this.field2248.close();
                    }
                    if (this.field2249 != null) {
                        this.field2249.close();
                    }
                } catch (IOException var10) {
                }
                this.field2253 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method3831((String) null, var15);
        }
    }
}
