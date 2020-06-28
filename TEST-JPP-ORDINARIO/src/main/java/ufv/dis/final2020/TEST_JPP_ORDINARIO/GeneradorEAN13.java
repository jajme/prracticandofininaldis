package ufv.dis.final2020.TEST_JPP_ORDINARIO;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;

 class GeneradorEAN13 {

	public static void generar(Producto p) throws WriterException, IOException {
		EAN13Writer ean13writer = new EAN13Writer();
		BitMatrix bitMatrix = ean13writer.encode(p.getEAN13(),BarcodeFormat.EAN_13, 300, 100);
		Path path = FileSystems.getDefault().getPath("./"+p.getName()+".png");
		MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
	}
	
	
}
