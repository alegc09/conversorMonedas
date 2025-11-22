public class Conversion {
    String base_code;
    String target_code;
    double conversion_result;
    float monto;


    public Conversion(ConversionApi conversionApi, float monto){

        this.base_code = conversionApi.base_code();
        this.target_code = conversionApi.target_code();
        this.conversion_result = Double.parseDouble(conversionApi.conversion_result());
        this.monto = monto;
    }

    @Override
    public String toString(){
        return "El monto: " + monto + " [" + base_code + "] corresponde a: " + conversion_result + " [" + target_code + "]";
    }
}