package Controller;

import Klasser.Medarbejder;
import Repository.MedarbejderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class Medarbejdercontroller {
    @RestController
    @RequestMapping("/medarbejdere")
    public class MedarbejderController {

        private final MedarbejderRepository.MedarbejderService medarbejderService;

        @Autowired
        public MedarbejderController(MedarbejderRepository.MedarbejderService medarbejderService) {
            this.medarbejderService = medarbejderService;
        }

        @PostMapping("/opret")
        public Medarbejder opretMedarbejder(@RequestBody Medarbejder medarbejder) {
            return medarbejderService.opretMedarbejder(medarbejder);
        }

        @GetMapping("/{medarbejderId}")
        public Medarbejder hentMedarbejder(@PathVariable Long medarbejderId) {
            return medarbejderService.hentMedarbejder(medarbejderId);
        }


    }


}
